/*
 * Created on Feb 10, 2009
 */
package com.u2d.generated;

import com.u2d.model.Title;
import com.u2d.type.atom.StringEO;
import com.u2d.type.AbstractChoiceEO;

/**
 * @author Arfath Pasha
 */
public class ConstType extends AbstractChoiceEO
{
   private final StringEO _code = new StringEO();
   private final StringEO _caption = new StringEO();
   public static String[] identities = {"code"};
   
   public ConstType() {}
   public ConstType(String code, String caption)
   {
      _code.setValue(code);
      _caption.setValue(caption);
   }
   
   public StringEO getCode() { return _code; }
   public StringEO getCaption() { return _caption; }
   
   public Title title()
   {
      return _caption.title();
   }
}
