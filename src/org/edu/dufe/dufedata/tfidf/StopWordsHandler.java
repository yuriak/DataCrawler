package org.edu.dufe.dufedata.tfidf;

import java.util.Dictionary;
import java.util.Hashtable;

	public class StopWordsHandler
	{		
		//停用词
		public static String[] stopWordsList=new String[] {"的",
            "我们","要","自己","之","将","“","”","，","（","）","后","应","到","某","后",
            "个","是","位","新","一","两","在","中","或","有","更","好","快讯","中国"
		} ;
		
		//停用的词性
		public static String [] stopPropertyOfWords={"c","p","w"};
		

		private static Hashtable _stopwords=null;
		private static Hashtable _stopProperties=null;

		public static Object AddElement(Dictionary collection,Object key, Object newValue)
		{
			Object element = collection.get(key);
			collection.put(key, newValue);
			return element;
		}

		public static boolean IsStopword(String str)
		{
			
			//int index=Array.BinarySearch(stopWordsList, str)
			return _stopwords.containsKey(str.toLowerCase());
		}
		
		public static boolean IsStopProperty(String property){
			return _stopProperties.containsKey(property.toLowerCase());
		}

		static  
		{
			if (_stopwords == null)
			{
				_stopwords = new Hashtable();
				double dummy = 0;
				for(String word:stopWordsList){
					_stopwords.put(word, dummy);
				}
			}
			if (_stopProperties==null){
				_stopProperties=new Hashtable();
				double dummy = 0;
				for (String property : stopPropertyOfWords) {
					_stopProperties.put(property, dummy);
				}
			}
		}
	}

