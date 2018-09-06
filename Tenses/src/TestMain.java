import simplenlg.framework.*;
import simplenlg.lexicon.*; 
import simplenlg.realiser.english.*;
import simplenlg.phrasespec.*;
import simplenlg.features.*;

  /*  public class TestMain {

        public static void main(String[] args) {
            Lexicon lexicon = Lexicon.getDefaultLexicon();
                    NLGFactory nlgFactory = new NLGFactory(lexicon);
                    Realiser realiser = new Realiser(lexicon);

                    
                    NLGElement s1 = nlgFactory.createSentence("my dog is happy");
                    String output = realiser.realiseSentence(s1); System.out.println(output);     
                    
                    
        }

    }*/




public class TestMain
{
    public static void main(String[] args)
    {
        String word = "ate";
        Lexicon lexicon=Lexicon.getDefaultLexicon();
        NLGFactory nlgFactory=new NLGFactory(lexicon);
        Realiser realiser=new Realiser(lexicon);
        SPhraseSpec p=nlgFactory.createClause();
        SPhraseSpec q=nlgFactory.createClause();
        SPhraseSpec r=nlgFactory.createClause();
        p.setVerb(word);
        q.setVerb(word);
        r.setVerb(word);
    /*    if(p.getVerb().getFeature(Feature.TENSE) == (Tense.PAST))
        {
            System.out.println("past");
        }
        if(p.getVerb().getFeature(Feature.TENSE) == (Tense.FUTURE))
        {
            System.out.println("future");
        }
        if(p.getVerb().getFeature(Feature.TENSE) == (Tense.PRESENT))
        {
            System.out.println("Present");
        }
        String output=realiser.realiseSentence(p);
        System.out.println(output);*/
  
    
      //  p.setSubject("Foo");
       // p.setVerb("grow");
     //   p.setObject("bar");
        p.setFeature(Feature.TENSE, Tense.PAST); 
        String output = realiser.realiseSentence(p);
        System.out.println(output); // "Foo ate bar"
       
        
      //  q.setVerb("grow");
        
        q.setFeature(Feature.TENSE, Tense.PRESENT); 
        String output1 = realiser.realiseSentence(q);
        System.out.println(output1);
        
        
      //  r.setVerb("grow");
        r.setFeature(Feature.TENSE, Tense.FUTURE); 
        String output2 = realiser.realiseSentence(r);
        System.out.println(output2);
    
        
        
    }
}