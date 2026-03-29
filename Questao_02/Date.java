public class Date {
    private int day;
    private int month;
    private int year;

    // Construtor
    public Date(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    // Métodos Getters e Setters
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (month == 2){
            if (day > 29) {
                throw new IllegalArgumentException("Fevereiro não pode passar de 29 dias");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11){
            if (day > 30) {
                throw new IllegalArgumentException("Abril, Junho, Setembro e Novembro só têm 30 dias");
            }
        }

        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Os dias devem estar entre 1 e 31!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Os meses deve estar entre 1 e 12!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("O ano deve ser maior que 0!");
        }
    }

    // Método para exibir a data formatada
    public void displayDate() {
        // %02d garante que números menores que 10 tenham um zero à esquerda (ex:
        System.out.printf("%02d/%02d/%d%n", day, month, year);
    }
}