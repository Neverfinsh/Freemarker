package lw.freemarker.controller;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import freemarker.template.SimpleSequence;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

public class SortMethod implements TemplateMethodModelEx {

	public Object exec(List arg0) throws TemplateModelException {
   SimpleSequence sequence=(SimpleSequence) arg0.get(0);
		List <BigDecimal> list=sequence.toList();
		
		Collections.sort(list, new Comparator<BigDecimal>() {

			public int compare(BigDecimal o1, BigDecimal o2) {
				// TODO Auto-generated method stub
				//进行升序的排序
				
				return o1.intValue()-o2.intValue();
			}
			
		});
		
		return list;
	}

}
