package project.Text;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MostFrequentWords {

    private static String[] arr = {"alma","computer", "hallo", "alma", "ahmed", "hi", "to", "learn", "alma", "computer",
            "learn","computer", "yup", "fire", "in", "alma", "lap", "ahmed", "hi", "learn"};

    public static PriorityQueue<MyWord> queue = new PriorityQueue<>();

    public static void createQueue() {

        for (String word : arr) {
            if (queue.contains(new MyWord(word,1))) {

                MyWord oldWord = null;
                Iterator<MyWord> itr = queue.iterator();
                while (itr.hasNext()) {

                    MyWord next = itr.next();
                    if (next.getWord().equals(word)) {
                        oldWord = next;
                    }
                }
                MyWord newWord = new MyWord(oldWord.getWord(),oldWord.getCount() + 1);
                queue.remove(oldWord);
                queue.add(newWord);

            } else {
                MyWord newWord = new MyWord( word,1);
                queue.add(newWord);
            }
        }

    }
}