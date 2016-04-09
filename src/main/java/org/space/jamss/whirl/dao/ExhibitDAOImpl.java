package org.space.jamss.whirl.dao;

import org.space.jamss.whirl.dto.Exhibit;
import org.space.jamss.whirl.repository.ExhibitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExhibitDAOImpl implements ExhibitDAO {
  private final ExhibitRepository exhibitRepository;

  @Autowired
  public ExhibitDAOImpl(ExhibitRepository exhibitRepository) {
    this.exhibitRepository = exhibitRepository;
  }

  @Override
  public Iterable<Exhibit> listExhibits() {
    return exhibitRepository.findAll();
  }

  @Override
  public Exhibit getExhibitByID(Integer exhibitID) {
    return exhibitRepository.findOne(exhibitID);
  }

  @Override
  public Exhibit saveExhibit(Exhibit exhibit) {
    return exhibitRepository.save(exhibit);
  }
}
