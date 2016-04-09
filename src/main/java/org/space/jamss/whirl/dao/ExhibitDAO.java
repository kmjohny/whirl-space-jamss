package org.space.jamss.whirl.dao;

import org.space.jamss.whirl.dto.Exhibit;

public interface ExhibitDAO {
  public Iterable<Exhibit> listExhibits();

  public Exhibit getExhibitByID(Integer exhibitID);

  public Exhibit saveExhibit(Exhibit exhibit);
}

