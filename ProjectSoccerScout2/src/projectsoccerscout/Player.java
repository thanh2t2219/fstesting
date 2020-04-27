/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsoccerscout;

/**
 *
 * @author oOo
 */
public class Player {

    private String name;
    private int age;
    private int number;
    private int height;
    private int weight;
    private String nationality;
    private String Position;
    //Info

    private int appearance;
    private int rating;
    private int goal;
    private int assist;
    private int red;
    private int yellow;
    //Overall stat

    private int tackle;
    private int tacklecomplete;
    private int interception;
    private int header;
    private int foul;
    //Defense

    private int pass;
    private int shortpass;
    private int longpass;
    private int keypass;
    private int passcomplete;
    //Transistion

    private int dribble;
    private int dribblecomplete;
    private int cross;
    private int crosscomplete;
    private int balllost;
    //Playmaking

    private int shoot;
    private int shootontarget;
    private int longshot;
    private int headershot;
    private int freekickgoal;

    //Attack
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }
    public void setBallloss(int age) {
        this.balllost = age; 
    }
    public int getBalllost() {
        return balllost;
    }


    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the appearance
     */
    public int getAppearance() {
        return appearance;
    }

    /**
     * @param appearance the appearance to set
     */
    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the Position
     */
    public String getPosition() {
        return Position;
    }

    /**
     * @param Position the Position to set
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * @return the goal
     */
    public int getGoal() {
        return goal;
    }

    /**
     * @param goal the goal to set
     */
    public void setGoal(int goal) {
        this.goal = goal;
    }

    /**
     * @return the assist
     */
    public int getAssist() {
        return assist;
    }

    /**
     * @param assist the assist to set
     */
    public void setAssist(int assist) {
        this.assist = assist;
    }

    /**
     * @return the red
     */
    public int getRed() {
        return red;
    }

    /**
     * @param red the red to set
     */
    public void setRed(int red) {
        this.red = red;
    }
    public int getFoul() {
        return foul;
    }

    /**
     * @param red the red to set
     */
    public void setFoul(int red) {
        this.foul = red;
    }
    /**
     * @return the yellow
     */
    public int getYellow() {
        return yellow;
    }

    /**
     * @param yellow the yellow to set
     */
    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    /**
     * @return the tackle
     */
    public int getTackle() {
        return tackle;
    }

    /**
     * @param tackle the tackle to set
     */
    public void setTackle(int tackle) {
        this.tackle = tackle;
    }

    /**
     * @return the tacklecomplete
     */
    public int getTacklecomplete() {
        return tacklecomplete;
    }

    /**
     * @param tacklecomplete the tacklecomplete to set
     */
    public void setTacklecomplete(int tacklecomplete) {
        this.tacklecomplete = tacklecomplete;
    }

    /**
     * @return the interception
     */
    public int getInterception() {
        return interception;
    }

    /**
     * @param interception the interception to set
     */
    public void setInterception(int interception) {
        this.interception = interception;
    }

    /**
     * @return the header
     */
    public int getHeader() {
        return header;
    }

    /**
     * @param header the header to set
     */
    public void setHeader(int header) {
        this.header = header;
    }

    /**
     * @return the pass
     */
    public int getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(int pass) {
        this.pass = pass;
    }

    /**
     * @return the shortpass
     */
    public int getShortpass() {
        return shortpass;
    }

    /**
     * @param shortpass the shortpass to set
     */
    public void setShortpass(int shortpass) {
        this.shortpass = shortpass;
    }

    /**
     * @return the longpass
     */
    public int getLongpass() {
        return longpass;
    }

    /**
     * @param longpass the longpass to set
     */
    public void setLongpass(int longpass) {
        this.longpass = longpass;
    }

    /**
     * @return the keypass
     */
    public int getKeypass() {
        return keypass;
    }

    /**
     * @param keypass the keypass to set
     */
    public void setKeypass(int keypass) {
        this.keypass = keypass;
    }

    /**
     * @return the passcomplete
     */
    public int getPasscomplete() {
        return passcomplete;
    }

    /**
     * @param passcomplete the passcomplete to set
     */
    public void setPasscomplete(int passcomplete) {
        this.passcomplete = passcomplete;
    }

    /**
     * @return the dribble
     */
    public int getDribble() {
        return dribble;
    }

    /**
     * @param dribble the dribble to set
     */
    public void setDribble(int dribble) {
        this.dribble = dribble;
    }

    /**
     * @return the dribblecomplete
     */
    public int getDribblecomplete() {
        return dribblecomplete;
    }

    /**
     * @param dribblecomplete the dribblecomplete to set
     */
    public void setDribblecomplete(int dribblecomplete) {
        this.dribblecomplete = dribblecomplete;
    }

    /**
     * @return the cross
     */
    public int getCross() {
        return cross;
    }

    /**
     * @param cross the cross to set
     */
    public void setCross(int cross) {
        this.cross = cross;
    }

    /**
     * @return the crosscomplete
     */
    public int getCrosscomplete() {
        return crosscomplete;
    }

    /**
     * @param crosscomplete the crosscomplete to set
     */
    public void setCrosscomplete(int crosscomplete) {
        this.crosscomplete = crosscomplete;
    }

    /**
     * @return the shoot
     */
    public int getShoot() {
        return shoot;
    }

    /**
     * @param shoot the shoot to set
     */
    public void setShoot(int shoot) {
        this.shoot = shoot;
    }

    /**
     * @return the shootontarget
     */
    public int getShootontarget() {
        return shootontarget;
    }

    /**
     * @param shootontarget the shootontarget to set
     */
    public void setShootontarget(int shootontarget) {
        this.shootontarget = shootontarget;
    }

    /**
     * @return the longshot
     */
    public int getLongshot() {
        return longshot;
    }

    /**
     * @param longshot the longshot to set
     */
    public void setLongshot(int longshot) {
        this.longshot = longshot;
    }

    /**
     * @return the headergoal
     */
    public int getHeadergoal() {
        return headershot;
    }

    /**
     * @param headergoal the headergoal to set
     */
    public void setHeadergoal(int headergoal) {
        this.headershot = headergoal;
    }

    /**
     * @return the freekickgoal
     */
    public int getFreekickgoal() {
        return freekickgoal;
    }

    /**
     * @param freekickgoal the freekickgoal to set
     */
    public void setFreekickgoal(int freekickgoal) {
        this.freekickgoal = freekickgoal;
    }

    public Player(String name, String Number, String Nationality, int age, String Position, int r, int app, int h, int w, int number, int g, int a, int red, int yellow, int t, int tcom, int i, int head, int p, int pcom, int lp, int sp, int kp, int d, int dcom, int c, int ccom, int s, int sot, int ls, int hs, int fg) {
        this.name = name;
        this.number = number;
        this.nationality = Nationality;
        this.age = age;
        this.Position = Position;
        this.height = h;
        this.weight = h;
        this.appearance = app;
        this.rating = 0;

        this.goal = g;
        this.assist = a;
        this.red = red;
        this.yellow = yellow;

        this.cross = c;
        this.crosscomplete = ccom;
        this.dribble = d;
        this.dribblecomplete = dcom;

        this.pass = p;
        this.shortpass = sp;
        this.longpass = lp;
        this.keypass = kp;
        this.passcomplete = pcom;

        this.shoot = s;
        this.shootontarget = sot;
        this.longshot = ls;
        this.freekickgoal = fg;
        this.headershot = hs;

        this.tackle = t;
        this.tacklecomplete = tcom;
        this.header = head;
        this.interception = i;

    }
}
