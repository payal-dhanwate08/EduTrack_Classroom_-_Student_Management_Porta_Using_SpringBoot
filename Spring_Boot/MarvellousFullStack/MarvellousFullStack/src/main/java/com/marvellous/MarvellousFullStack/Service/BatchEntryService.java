package com.marvellous.MarvellousFullStack.Service;

import com.marvellous.MarvellousFullStack.Entity.BatchEntry;
import com.marvellous.MarvellousFullStack.Repository.BatchEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class BatchEntryService
{
    @Autowired
    private BatchEntryRepository batchEntryRepository;

    //create POST
    public void saveEntry(BatchEntry batchEntry)
    {
        batchEntryRepository.save(batchEntry);
    }

    //Read GET
    public List<BatchEntry> getAll()
    {
        return batchEntryRepository.findAll();
    }

    public Optional<BatchEntry> findByID(ObjectId id)
    {
        return batchEntryRepository.findById(id);
    }

    public void createById(ObjectId id)
    {
        batchEntryRepository.deleteById(id);
    }

    public void deleteById(ObjectId id)
    {
        batchEntryRepository.deleteById(id);
    }
}


