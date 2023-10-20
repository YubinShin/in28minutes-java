 public char assignGrade() {
 
        if(this.marks>100|| this.marks < 0){return 'X';}
        else if(this.marks >= 90){return 'A';}
        else if(this.marks >= 80){return 'B';}
        else if(this.marks >= 70){return 'C';}
        else if(this.marks >= 60){return 'D';}
        else if(this.marks >= 50){return 'E';}
        else(this.marks < 50){ return 'F';}
}