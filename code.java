    public static int randomXOR ()
    {
        int x = 0, y = 0, z = 0, w = 0, t;
        if (x == 0)
            x = (int) (initRNG * 65535);
        System.out.println (x);
        for (int r = 0 ; r < 1000 ; r++)
        {
            t = x ^ (x << 11);
            x = y;
            y = z;
            z = w;
            w = (char) (w ^ (w >>> 19) ^ t ^ (t >>> 8));
        }
        return w;
    }
