
/**
 * Write a description of class NPCs here.
 *
 * @Chris Compierchio
 * @3/19/24
 * This is a class thats used to initialize interactions players have with NPCs
 */
public class NPCs
{
    
    private String introDialogue;
    private String talkToDialogue;
    private String useToDialogue;
    // Constructor
    public NPCs(String introDialogue, String talkToDialogue, String useToDialogue) {
        this.introDialogue = introDialogue;
        this.talkToDialogue = talkToDialogue;
        this.useToDialogue = useToDialogue;
    }

    // Setter for intro dialogue
    public void setIntroDialogue(String introDialogue) {
        this.introDialogue = introDialogue;
    }

    // Setter for talk-to dialogue
    public void setTalkToDialogue(String talkToDialogue) {
        this.talkToDialogue = talkToDialogue;
    }
    
    // Setter for use-to dialogue
    public void setUseToDialogue(String useToDialogue) {
        this.useToDialogue = useToDialogue;
    }
    
    // Getter for intro dialogue
    public String getIntroDialogue() {
        return introDialogue;
    }

    // Getter for talk-to dialogue
    public String getTalkToDialogue() {
        return talkToDialogue;
    }
    
    // Getter for use-to dialogue
    public String getUseToDialogue() {
        return useToDialogue;
    }
}

