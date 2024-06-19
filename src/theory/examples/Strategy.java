package theory.examples;

public class Strategy {
    // Strategy Interface
    public static interface WeaponStrategy {
        void useWeapon();
    }

    // Concrete Strategy for Sword
    public static class SwordStrategy implements WeaponStrategy {
        @Override
        public void useWeapon() {
            System.out.println("Swinging a sword!");
        }
    }

    // Concrete Strategy for Bow and Arrow
    public static class BowAndArrowStrategy implements WeaponStrategy {
        @Override
        public void useWeapon() {
            System.out.println("Shooting an arrow!");
        }
    }

    // Concrete Strategy for Knife
    public static class KnifeStrategy implements WeaponStrategy {
        @Override
        public void useWeapon() {
            System.out.println("Stabbing with a knife!");
        }
    }

    // Context
    public static class GameCharacter {
        private WeaponStrategy weaponStrategy;

        // Set the strategy (weapon) at runtime
        public void setWeaponStrategy(WeaponStrategy weaponStrategy) {
            this.weaponStrategy = weaponStrategy;
        }

        // Use the current strategy (weapon)
        public void fight() {
            if (weaponStrategy != null) {
                weaponStrategy.useWeapon();
            } else {
                System.out.println("No weapon selected!");
            }
        }
    }

    public static class Main {
        public static void main(String[] args) {
            GameCharacter character = new GameCharacter();

            // Use Sword
            character.setWeaponStrategy(new SwordStrategy());
            character.fight();

            // Use Bow and Arrow
            character.setWeaponStrategy(new BowAndArrowStrategy());
            character.fight();

            // Use Knife
            character.setWeaponStrategy(new KnifeStrategy());
            character.fight();

            // No weapon selected
            character.setWeaponStrategy(null);
            character.fight();
        }
    }




}
