package project.Text;

class MyWord implements Comparable<MyWord>{

    private String word;
    private int count;

    public MyWord( String word,int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;

        MyWord myWord = (MyWord) obj;
        return this.word.equals(myWord.word);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return this.word + " : " + this.count;
    }

    public int compareTo(MyWord o) {
        if(this.count > o.count) {
            return -1;
        }
        if(this.count < o.count) {
            return 1;
        }
        return 0;
    }

}