DESCRIPTION = "This distribution was written to ensure that a META.yml file, provided with \
a standard distribution uploaded to CPAN, meets the specifications that are \
slowly being introduced to module uploads, via the use of package makers \
and installers such as ExtUtils::MakeMaker, Module::Build and \
Module::Install."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-CPAN-Meta"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BA/BARBIE/Test-CPAN-Meta-0.25.tar.gz"

SRC_URI[md5sum] = "d1582df35cc1e8875357702c687ed22f"
SRC_URI[sha256sum] = "f55b4f9cf6bc396d0fe8027267685cb2ac4affce897d0967a317fac6db5a8db5"
RECOMMENDS += "test-cpan-meta-json-perl-native"
RECOMMENDS += "test-pod-coverage-perl-native"
RECOMMENDS += "test-pod-perl-native"

S = "${WORKDIR}/Test-CPAN-Meta-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
