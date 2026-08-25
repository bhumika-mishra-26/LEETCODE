class BrowserHistory {
    Stack<String> past;
    Stack<String> future;

    public BrowserHistory(String homepage) {
        past = new Stack<>();
        future = new Stack<>();

        past.push(homepage);
    }

    public void visit(String url) {
        past.push(url);
        future = new Stack<>();
    }

    public String back(int step) {
        while (step > 0 && past.size() > 1) {
            future.push(past.pop());
            step--;
        }

        return past.peek();
    }

    public String forward(int step) {
        while (step > 0 && !future.isEmpty()) {
            past.push(future.pop());
            step--;
        }

        return past.peek();
    }
}