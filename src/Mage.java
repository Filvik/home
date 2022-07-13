public class Mage {

    private String name;
    private int level;
    private int damage;
    private String type;
    private String mage;

    public Mage(String name, int level, int damage, String type) {

        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;

        if (type != "fire" && type != "ice" && type != "earth") {
            System.out.println("Error type");
        }
    }

    public String getInfo() {
        return mage = (name + " ," + level + " ," + damage + " ," + type);
    }

    public String fight(Mage mage) {

        if ((this.type).equals("fire")) {
            if ((mage.type).equals("ice")) {
                return this.name;
            } else if ((mage.type).equals("earth")) {
                return mage.name;
            }
            else if ((this.type).equals(mage.type)) {
                if ((this.level) > (mage.level)) {
                    return this.name;
                } else if ((this.level) < (mage.level)) {
                    return mage.name;
                } else {
                    if ((this.damage) > (mage.damage)) {
                        return this.name;
                    } else if ((this.damage) < (mage.damage)) {
                        return mage.name;
                    }
                }
            }
        }
        else if ((this.type).equals("ice")) {
            if ((mage.type).equals("fire")) {
                return mage.name;
            } else if ((mage.type).equals("earth")) {
                return this.name;
            }
            else if ((this.type).equals(mage.type)) {
                if ((this.level) > (mage.level)) {
                    return this.name;
                } else if ((this.level) < (mage.level)) {
                    return mage.name;
                } else {
                    if ((this.damage) > (mage.damage)) {
                        return this.name;
                    } else if ((this.damage) < (mage.damage)) {
                        return mage.name;
                    }
                }
            }
        } else if ((this.type).equals("earth")) {
            if ((mage.type).equals("ice")) {
                return mage.name;
            } else if ((mage.type).equals("fire")) {
                return this.name;
            }
            else if ((this.type).equals(mage.type)) {
                if ((this.level) > (mage.level)) {
                    return this.name;
                } else if ((this.level) < (mage.level)) {
                    return mage.name;
                } else {
                    if ((this.damage) > (mage.damage)) {
                        return this.name;
                    } else if ((this.damage) < (mage.damage)) {
                        return mage.name;
                    }
                }
            }
        } else if ((this.type).equals(mage.type)) {
            if ((this.level) > (mage.level)) {
                return this.name;
            } else if ((this.level) < (mage.level)) {
                return mage.name;
            } else {
                if ((this.damage) > (mage.damage)) {
                    return this.name;
                } else if ((this.damage) < (mage.damage)) {
                    return mage.name;
                }
            }
        }
        return "draw";
    }
}
