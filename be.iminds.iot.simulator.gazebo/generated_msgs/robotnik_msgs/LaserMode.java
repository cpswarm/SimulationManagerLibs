package robotnik_msgs;

public interface LaserMode extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/LaserMode";
  static final java.lang.String _DEFINITION = "string STANDARD=standard\nstring DOCKING_STATION=docking_station\nstring CART=cart\nstring CART_DOCKING_CART=cart_docking_cart\nstring DOCKING_CART=docking_cart\n\nstring name\n";
  static final java.lang.String STANDARD = "standard";
  static final java.lang.String DOCKING_STATION = "docking_station";
  static final java.lang.String CART = "cart";
  static final java.lang.String CART_DOCKING_CART = "cart_docking_cart";
  static final java.lang.String DOCKING_CART = "docking_cart";
  java.lang.String getName();
  void setName(java.lang.String value);
}
