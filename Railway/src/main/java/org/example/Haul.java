package org.example;

public class Haul {
    private int number_of_paths;//Количество пуетй
    private double length;//Длина
    private int number_of_block_plots;//Количество блок-участков
    private String array_of_path_states;//Массив состояний путей

    public Haul(int number_of_paths, double length,int number_of_block_plots, String array_of_path_states) {
        this.number_of_paths = number_of_paths;
        this.length = length;
        this.number_of_block_plots = number_of_block_plots;
        this.array_of_path_states = array_of_path_states;

    }

    public Haul() {
        number_of_paths =25;
        length =6000;
        number_of_block_plots =243;
        array_of_path_states = 0_101_010_101_011_110;
    }

    public int getNumber_of_paths() {
        return number_of_paths;
    }

    public void setNumber_of_paths(int number_of_paths) {
        this.number_of_paths = number_of_paths;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getNumber_of_block_plots() {
        return number_of_block_plots;
    }

    public void setNumber_of_block_plots(int number_of_block_plots) {
        this.number_of_block_plots = number_of_block_plots;
    }

    public String getArray_of_path_states() {
        return array_of_path_states;
    }

    public void setArray_of_path_states(String array_of_path_states) {
        this.array_of_path_states = array_of_path_states;
    }
    public String toString(){
        return "Haul{"
                + "number_of_paths='" + number_of_paths + '\''
                + ", length=" + length
                + ", number_of_block_plots=" + number_of_block_plots
                + ", array_of_path_states=" + array_of_path_states
                + '}';
}
}

