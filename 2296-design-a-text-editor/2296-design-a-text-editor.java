class TextEditor {

    Deque<Character> left;
    Deque<Character> right;

    public TextEditor() {
        left=new ArrayDeque<>();
        right=new ArrayDeque<>();    
    }
    
    public void addText(String text) {
        for(int i=0;i<text.length();i++){
        left.addLast(text.charAt(i));
        }
    }
    
    public int deleteText(int k) {
        int count=0;
       while (k > 0 && !left.isEmpty()) {
        left.removeLast();
        count++;
        k--;
    }
        return count;
    }

    private String getLast10() {
    StringBuilder sb = new StringBuilder();

    Iterator<Character> it = left.descendingIterator();

    int count = 0;
    while (it.hasNext() && count < 10) {
        sb.append(it.next());
        count++;
    }

    return sb.reverse().toString();
}


    
    public String cursorLeft(int k) {
        while (k > 0 && !left.isEmpty()) {
        right.addFirst(left.removeLast());
        k--;
        }

        return getLast10();
    }
    
    public String cursorRight(int k) {
        while (k > 0 && !right.isEmpty()) {
        left.addLast(right.removeFirst());
        k--;
    }

    return getLast10();
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */