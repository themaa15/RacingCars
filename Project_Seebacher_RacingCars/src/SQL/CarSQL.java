/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

/**
 *
 * @author maxth
 */
public enum CarSQL {
   STMT_FIND_ALL("SELECT * from Car"),
   PSTMT_FIND_FIRST("SELECT * from Car WHERE place=?"),
   STMT_DELETE("DELETE from Car"),
   PSTMT_DELETE_BY_ID("DELETE from Car WHERE id=?"),
   PSTMT_INSERT( " INSERT INTO Employee (carname, driver, time, place) VALUES (?, ?, ?, ?)" ),
   PSTMT_FIND_BY_ID(" SELECT * FROM Car WHERE id = ? "),
   PSTMT_UPDATE( " UPDATE Car SET carname=?, driver=?, time=?, place=? " );

   private String sql;

    private CarSQL(String sql ) {
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }
}
