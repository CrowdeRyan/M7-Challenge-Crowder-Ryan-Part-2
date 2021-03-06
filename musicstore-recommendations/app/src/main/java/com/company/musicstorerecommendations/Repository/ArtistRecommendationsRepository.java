package com.company.musicstorerecommendations.Repository;

import com.company.musicstorerecommendations.Model.ArtistRecommendations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRecommendationsRepository extends JpaRepository<ArtistRecommendations, Integer> {
}
