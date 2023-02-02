package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana Carolina Botina García
 */
public class SentenciasSql {
    private Connection conex;
    private ResultSet resId;
    //La variable id guarda el último id registrado en la tabla transaccion
    int id = 0;
    
    private PreparedStatement guardarTransaccion;
    private PreparedStatement guardarCuentaTransaccion;
    private PreparedStatement actualizarSaldoAbono;
    private PreparedStatement actualizarSaldoRetiro;
    
    public SentenciasSql(){
        String servidor = "jdbc:mysql://localhost:3306/cuenta_bancaria";
        sentencias(servidor, "root");
    }
    
    private void sentencias(String servidor, String usuario){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex = DriverManager.getConnection(servidor, usuario, "");
            
            guardarTransaccion = conex.prepareStatement("INSERT INTO transaccion(tipo_transaccion,monto,fecha) VALUES (?,?,?)",Statement.RETURN_GENERATED_KEYS);
            guardarCuentaTransaccion = conex.prepareStatement("INSERT INTO cuenta_transaccion(cuenta_numero_cuenta,transaccion_id) VALUES (?,?)");
            actualizarSaldoAbono = conex.prepareStatement("UPDATE cuenta SET saldo_total=saldo_total+? WHERE numero_cuenta=?");
            actualizarSaldoRetiro = conex.prepareStatement("UPDATE cuenta SET saldo_total=saldo_total-? WHERE numero_cuenta=?");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    

    public void abono(float monto_abono){
        
        try {
            guardarTransaccion.setString(1, "Abono");
            guardarTransaccion.setFloat(2, monto_abono);
            guardarTransaccion.setString(3, LocalDate.now()+"");
            guardarTransaccion.execute();
            
            resId = guardarTransaccion.getGeneratedKeys();
            if (resId.next()) {
                id = resId.getInt(1);
            }
            
            JOptionPane.showMessageDialog(null, "Su dinero ha sido almacenado con éxito");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void cuentaTransaccion(String numeroCuenta){
        try {
            guardarCuentaTransaccion.setString(1, numeroCuenta);
            guardarCuentaTransaccion.setInt(2, id);
            guardarCuentaTransaccion.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void actualizarSaldoAbono(String numeroCuenta,float monto){
        try {
            actualizarSaldoAbono.setFloat(1, monto);
            actualizarSaldoAbono.setString(2, numeroCuenta);
            actualizarSaldoAbono.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void retiro(float monto_abono){
        
        try {
            guardarTransaccion.setString(1, "Retiro");
            guardarTransaccion.setFloat(2, monto_abono);
            guardarTransaccion.setString(3, LocalDate.now()+"");
            guardarTransaccion.execute();
            
            resId = guardarTransaccion.getGeneratedKeys();
            if (resId.next()) {
                id = resId.getInt(1);
            }
            
            JOptionPane.showMessageDialog(null, "Retiro exitoso");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void actualizarSaldoRetiro(String numeroCuenta,float monto){
        try {
            actualizarSaldoRetiro.setFloat(1, monto);
            actualizarSaldoRetiro.setString(2, numeroCuenta);
            actualizarSaldoRetiro.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}