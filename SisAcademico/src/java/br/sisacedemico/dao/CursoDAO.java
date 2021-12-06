package br.sisacedemico.dao;

import br.sisacademico.model.Curso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.Map;

//Essa classe é responsável por fazer o CRUD de Cursos
public class CursoDAO {

    private static Statement stm = null;
    
    public Map<Curso, Integer> getTodosCursosCountAlunos() throws SQLException {
        
        String query = "SELECT ID_CURSO, NOME_CURSO, TIPO_CURSO,"
                + "    (SELECT COUNT(*) "
                + "       FROM TB_ALUNO"
                + "      WHERE ID_CURSO = CURSO.ID_CURSO) AS QTD_ALUNOS"
                + " FROM"
                + "    TB_CURSO as CURSO"
                + " ORDER BY"
                + "    CURSO.NOME_CURSO";
        
        Map<Curso, Integer> relatorio = new LinkedHashMap<>();
        
        stm = ConnectionFactory.getConnection().createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        
        ResultSet resultados = stm.executeQuery(query);
        
        while(resultados.next()) {
            Curso c = new Curso();
            c.setIdCurso(resultados.getInt("ID_CURSO"));
            c.setNomeCurso(resultados.getString("NOME_CURSO"));
            c.setTipoCurso(resultados.getString("TIPO_CURSO"));
            int qtdAlunos = resultados.getInt("QTD_ALUNOS");
            
            relatorio.put(c, qtdAlunos);
        }
        
        stm.getConnection().close();
        
        return relatorio;
    }
    
    public boolean deleteCurso(int idCurso) {
        try {
            String query = "DELETE FROM TB_CURSO WHERE ID_CURSO = ?";
            PreparedStatement stm = ConnectionFactory.getConnection().
                    prepareStatement(query);
            stm.setInt(1, idCurso);
            stm.execute();
            stm.getConnection().close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
