public class FirstSteps {
    public int sum(int a, int b) {
        return a + b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
    public int mod(int a, int b) {
        return a % b;
    }
    public boolean isEqual(int a, int b) {
        return a == b;
    }
    public boolean isGreater(int a, int b) {
        return a > b;
    }
    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        boolean answer = false;
        if((xLeft > xRight)||(yTop > yBottom)){
            answer = false;
        } else if ((x >= xLeft)&&(x <= xRight)&&(y <= yBottom)&&(y >= yTop)){
            answer = true;
        } else {
            answer =  false;
        }
        return answer;
        //return ((x <= xRight) & (x >= xLeft) & (y <= yTop) & (y >= yBottom));
    }
    public int sum(int[] a){
        int answer = 0;
        for (var i : a) {
            answer += i;
        }
        return answer;
    }
}
