// Decompiled by DJ v3.10.10.93 Copyright 2007 Atanas Neshkov  Date: 13.08.2012 13:54:45
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   SaveManager.java

package zombie;

import java.io.File;

public class SaveManager
{

    public SaveManager()
    {
    }

    private static boolean deleteDirectory(File path)
    {
        if(path.exists())
        {
            File files[] = path.listFiles();
            for(int i = 0; i < files.length; i++)
                if(files[i].isDirectory())
                    deleteDirectory(files[i]);
                else
                    files[i].delete();

        }
        return path.delete();
    }

    public void init(String s)
    {
    }

    public void StartMassInsertion()
    {
    }

    public void EndMassInsertion()
    {
    }

    public static SaveManager instance = new SaveManager();

}