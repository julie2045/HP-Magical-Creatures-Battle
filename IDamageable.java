// Something that is damagable
interface IDamageable {

  int health();
  void setHealth(int level);
 
  // whether or not the thing is damaged to a defeated state
  boolean isDefeated();
}