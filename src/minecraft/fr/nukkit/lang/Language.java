package fr.nukkit.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import net.minecraft.src.StringTranslate;

/**
 * Nukkit lang loader class.
 * @author Mathieu Bour (Dierka)
 * @version 1.0
 * @since 2.0R0.1
 */
public class Language
{
	private static Language instance = new Language();
	
	public Language() {}
	
	/**
	 * Returns the instance of the class.
	 * @return
	 */
	public static Language getInstance()
	{
		return instance;
	}
	
	/**
	 * Load the langage from the Nukkit langage files.
	 * @param par1Properties
	 * @param par2Str
	 * @throws IOException
	 */
	public void loadLanguage(Properties par1Properties, String par2Str) throws IOException
	{
		try
		{
			par2Str = par2Str.split("_")[0];
			
	        BufferedReader var3 = new BufferedReader(new InputStreamReader(Language.class.getResourceAsStream("/fr/nukkit/lang/" + par2Str + ".lang"), "UTF-8"));

	        for (String var4 = var3.readLine(); var4 != null; var4 = var3.readLine())
	        {
	            var4 = var4.trim();

	            if (!var4.startsWith("#") && !var4.startsWith("//")) // comment with '#'
	            {
	                String[] var5 = var4.split("=");

	                if (var5 != null && var5.length == 2 && !var5[0].isEmpty() && !var5[1].isEmpty())
	                {
	                    par1Properties.setProperty(var5[0], var5[1]);
	                }
	            }
	        }
		}
		catch(Exception e)
		{
			System.out.println("Erreur : langage file does'nt exist!\n" + e.getMessage());
		}
		
	}
}
