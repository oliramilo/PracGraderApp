package com.curtin.game.pracgrader.Database;

public class MarksSchema {
    public static class MarksTable {
        public static final String NAME = "Marks";

        public static final String CREATE_TABLE =   "CREATE TABLE IF NOT EXISTS " + NAME + " ( " +
                                                    Cols.USERNAME + " TEXT PRIMARY KEY NOT NULL, " +
                                                    Cols.SCORE + " INTEGER, " + Cols.DESCRIPTION +
                                                    " TEXT, " + "FOREIGN KEY (" + Cols.USERNAME +")" +
                                                    " REFERENCES " + UserSchema.UserTable.NAME + "(" +
                                                    UserSchema.UserTable.Cols.USERNAME + ")" +
                                                    " ON UPDATE CASCADE ON DELETE CASCADE );";
        public class Cols {
            public static final String USERNAME = UserSchema.UserTable.Cols.USERNAME;
            public static final String SCORE = "score";
            public static final String DESCRIPTION = "description";
        }
    }
}
