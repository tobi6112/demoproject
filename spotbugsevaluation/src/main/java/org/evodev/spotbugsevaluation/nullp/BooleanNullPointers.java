package org.evodev.spotbugsevaluation.nullp;

public class BooleanNullPointers {

  private static final Boolean aBoolean = null;

  // Unknown detection
  public Boolean returnDirectNull() {
    return null;
  }

  // Unknown detection
  public Boolean returnNullFromVariable() {
    return aBoolean;
  }

  // Unknown detection
  public Boolean booleanOperationAnd(Boolean a, Boolean b) {
    return a && b;
  }

  // Unknown detection
  public Boolean returnBooleanFromWrittenVariable() {
    Boolean bBoolean = null;
    bBoolean = false;
    return bBoolean;
  }
}
