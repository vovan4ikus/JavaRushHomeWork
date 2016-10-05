package com.javarush.test.level15.lesson12.home05;

/**
 * Created by vovik on 21.10.15.
 */
public class SubSolution extends Solution
{
     SubSolution()    {
    }

     SubSolution(int i)
    {
        super(i);
    }

     SubSolution(Integer i)
    {
        super(i);
    }

    private SubSolution(String s){}
    private SubSolution(char c){}
    private SubSolution(boolean b){}

    protected SubSolution(int i, char c)
    {
        super(i, c);
    }

    protected SubSolution(char c, int i)
    {
        super(c, i);
    }

    protected SubSolution(short sh)
    {
        super(sh);
    }

    public SubSolution(int i, int j)
    {
        super(i, j);
    }

    public SubSolution(char c, String s)
    {
        super(c, s);
    }

    public SubSolution(Integer i, int j)
    {
        super(i, j);
    }
}
