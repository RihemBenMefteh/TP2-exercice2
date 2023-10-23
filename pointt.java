
public class Pointt
{
    public int abs;
    public int ord;
    int nbr;
    int num;


    public Pointt(int abc, int ord)
    {
        this.abs = 0;
        this.ord = 0 ;
        nbr++;
        num++;
    }

    void setCoordonneePointt(int u , int v)
    {
        abs=u;
        ord=v;
    }

    void Point (int u, int v)
    {
        this.abs=u;
        this.ord=v;
    }


    void translate(int u , int v)
    {
        abs=abs+u;
        ord=ord+v;

    }
    void affichePointt()
    {
        System.out.println("l'abcise de la point p est:"+this.abs);
        System.out.println("l'abcise de la point p est:"+this.ord);
    }
    public Pointt origine()
    {
        if ((abs == 0) && (ord == 0)) {
            System.out.println("nulles");
        }
        else {
            System.out.println(" sont non nulles");
        }
    }

    public boolean egale(Pointt q)
    {
        if((this.abs ==q.abs)&&(this.ord==q.ord))
        {
            return true;
        }
        else {
            return false;
        }

    }







