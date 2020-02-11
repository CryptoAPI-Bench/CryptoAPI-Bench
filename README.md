# CryptoAPI-Bench

Comprehensive benchmark on Java Cryptographic misuses. It contains 16 cryptographic vulnerabilities. It contains both secure and insecure code snippet. Please check the CryptoAPI_Bench_details.xlsx for more information.

### Build Cryptoapi-bench
1. Run `cd /path/to/cryptoapi-bench`
2. Run `gradle clean build`

A Jar will be created in `cd /path/to/cryptoapi-bench/build/libs/` folder. Use different Cryptographic vulnerability detection tools to analyze the Jar.  

The `CryptoAPI-Bench_details.xlsx` contains the summary of secure and nonsecure code and pointed out the vulnerability.


### Paper
If you use this code or these benchmarks in your research, please cite the following publication.
```
@inproceedings{afrose2019cryptoapi,
  title={CryptoAPI-Bench: A Comprehensive Benchmark on Java Cryptographic API Misuses},
  author={Afrose, Sharmin and Rahaman, Sazzadur and Yao, Danfeng},
  booktitle={2019 IEEE Cybersecurity Development (SecDev)},
  pages={49--61},
  year={2019},
  organization={IEEE}
}

@inproceedings{rahaman2019cryptoguard,
  title={Cryptoguard: High precision detection of cryptographic vulnerabilities in massive-sized java projects},
  author={Rahaman, Sazzadur and Xiao, Ya and Afrose, Sharmin and Shaon, Fahad and Tian, Ke and Frantz, Miles and Kantarcioglu, Murat and Yao, Danfeng},
  booktitle={Proceedings of the 2019 ACM SIGSAC Conference on Computer and Communications Security},
  pages={2455--2472},
  year={2019}
}
```

### Contact
If you have any questions or suggestions regarding this project, please email to sharminafrose@vt.edu
