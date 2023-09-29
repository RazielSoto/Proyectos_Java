package datos;

import domain.Criptomoneda;
import java.util.List;
import java.sql.*;

public class CriptomonedaJDBC {
    private static final String SQL_SELECT = "SELEC Id_Criptomoneda, Nombre, Valor_Actual, Compra_1, Total FROM criptomonedas";
    private static final String SQL_INSERT = "INSERT INTO criptomonedas(Id_Criptomoneda, Nombre, Valor_Actual, Compra_1, Compra_2) TotalVALUES(?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE criptomonedas SET Nombre=?, Valor_Actual=?, Compra_1=?, Total=? WHERE Id_Criptomoneda=? ";
    private static final String SQL_DELETE = "DELETE FROM criptomonedas WHERE Id_Criptomoneda";
    private Connection conexionTransaccional;
    
    public CriptomonedaJDBC (){}
    
    public CriptomonedaJDBC(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }
    
    
    public List<Criptomoneda> select(){
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement = null;
        Criptomoneda criptomoneda = null;
        List<Criptomoneda> = new ArrayList<Criptomoneda>;
        
        conn = this.conexionTransaccional != ? this.conexionTransaccional : 
                stmt = conn.prepareStatement(SQL_SELECT);
        while(rs.next()){
        }
    }
}
