package com.genly.homeshop;

public interface Writer {
    /**
     * Start writing process
     */
    public void start();

    /**
     * Write on line
     * @param line this is a line writing
     */
    public void writeLine(String line);

    /**
     * Stop writing process
     */
    public void stop();
}
