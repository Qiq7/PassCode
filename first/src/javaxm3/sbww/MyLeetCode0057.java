package javaxm3.sbww;

public class MyLeetCode0057 {
    private int big,medium,small;

    public MyLeetCode0057(int big, int medium, int small)
    {
            this.big=big;
            this.medium=medium;
            this.small=small;
    }
    public boolean addCar(int carType) {
        switch (carType)
        {
            case 1 :
            {
                if(big>0)
                {
                    big--;
                    return true;
                }
            } break;
            case 2 :
            {
                if (medium>0)
                {
                    medium--;
                    return true;
                }
            }break;
            case 3 :
            {
                if(small>0)
                {
                    small--;
                    return true;
                }
            }break;

        }
        return false;
    }
}
