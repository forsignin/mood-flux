package com.mood.flux.service.impl;

import com.mood.flux.entity.KAccount;
import com.mood.flux.mapper.AccountMapper;
import com.mood.flux.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mood on 2018/7/15.
 */
@Service
@Transactional
public class AccountServiceImpl extends BaseServiceImpl<KAccount> implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
}
