package com.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.example.dao.EquipoDAO;
import com.example.dao.JugadorDAO;
import com.example.entities.Equipo;
import com.example.entities.Jugador;

public class NBASwingApp {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private JTextField buscarJugadorField;
    private JTextField buscarEquipoField;
    private JTable resultadosTable;

    public NBASwingApp() {
        entityManagerFactory = Persistence.createEntityManagerFactory("NbaPersistenceUnit");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void iniciarInterfaz() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("NBA App");
            frame.setSize(800, 800);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());

            JButton buscarEquiposButton = new JButton("Equipos");
            JButton buscarJugadoresButton = new JButton("Jugadores");

            buscarJugadorField = new JTextField(15);
            buscarEquipoField = new JTextField(15);

            JButton buscarJugadorButton = new JButton("Buscar Jugador");
            JButton buscarEquipoButton = new JButton("Buscar Equipo");

            String[] columnas = {"Nombre", "Apellido", "Posición", "Equipo", "Número", "Altura", "País", "Peso"};
            String[][] datos = {};

            resultadosTable = new JTable(datos, columnas);

            buscarEquiposButton.addActionListener(e -> {
                EquipoDAO equiposDAO = new EquipoDAO(entityManager);
                actualizarTablaEquipos(resultadosTable, equiposDAO.obtenerTodosEquipos());
            });

            buscarJugadoresButton.addActionListener(e -> {
                JugadorDAO jugadoresDAO = new JugadorDAO(entityManager);
                actualizarTablaJugadores(resultadosTable, jugadoresDAO.obtenerTodosJugadores());
            });

            buscarJugadorButton.addActionListener(e -> {
                JugadorDAO jugadorDAO = new JugadorDAO(entityManager);
                actualizarTablaJugadores(resultadosTable, jugadorDAO.obtenerJugadorPorNombre(buscarJugadorField.getText()));
            });

            buscarEquipoButton.addActionListener(e -> {
                EquipoDAO equipoDAO = new EquipoDAO(entityManager);
                actualizarTablaEquipos(resultadosTable, equipoDAO.obtenerEquipoPorNombre(buscarEquipoField.getText()));
            });

            panel.add(new JLabel("Equipos: "));
            panel.add(buscarEquiposButton);
            panel.add(new JLabel("Jugadores: "));
            panel.add(buscarJugadoresButton);
            panel.add(new JLabel("Buscar Jugador: "));
            panel.add(buscarJugadorField);
            panel.add(buscarJugadorButton);
            panel.add(new JLabel("Buscar Equipo: "));
            panel.add(buscarEquipoField);
            panel.add(buscarEquipoButton);

            JScrollPane scrollPane = new JScrollPane(resultadosTable);
            panel.add(scrollPane);

            frame.getContentPane().add(BorderLayout.CENTER, panel);
            frame.setVisible(true);
        });
    }

    private void actualizarTablaEquipos(JTable table, List<Equipo> equipos) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Abreviatura");
        model.addColumn("Ciudad");
        model.addColumn("Conferencia");
        model.addColumn("División");
        model.addColumn("Nombre Completo");

        for (Equipo equipo : equipos) {
            Object[] fila = {
                    equipo.getAbreviatura(),
                    equipo.getCiudad(),
                    equipo.getConferencia(),
                    equipo.getDivision(),
                    equipo.getNombreCompleto()
            };
            model.addRow(fila);
        }

        table.setModel(model);
    }

    private void actualizarTablaJugadores(JTable table, List<Jugador> jugadores) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Posición");
        model.addColumn("Equipo");
        model.addColumn("Número");
        model.addColumn("Altura");
        model.addColumn("País");
        model.addColumn("Peso");

        for (Jugador jugador : jugadores) {
            Object[] fila = {
                    jugador.getNombre(),
                    jugador.getApellido(),
                    jugador.getPosicion(),
                    (jugador.getEquipo() != null) ? jugador.getEquipo().getNombreCompleto() : "",
                    jugador.getNumero(),
                    jugador.getAltura(),
                    jugador.getPais(),
                    jugador.getPeso()
            };
            model.addRow(fila);
        }

        table.setModel(model);
    }

    

    public static void main(String[] args) {
        new NBASwingApp().iniciarInterfaz();
    }
}
