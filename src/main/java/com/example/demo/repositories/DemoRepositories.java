package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.DemoDetailes;

public interface DemoRepositories extends JpaRepository<DemoDetailes, Long> {

}
