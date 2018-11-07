DESCRIPTION = "This module was written to ensure that a META.json file, provided with a \
standard distribution uploaded to CPAN, meets the specifications that are \
slowly being introduced to module uploads, via the use of package makers \
and installers such as ExtUtils::MakeMaker, Module::Build and \
Module::Install."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-CPAN-Meta-JSON"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BA/BARBIE/Test-CPAN-Meta-JSON-0.16.tar.gz"

SRC_URI[md5sum] = "1d6f3ff573e8b8b3daf89f677b7404bf"
SRC_URI[sha256sum] = "67ac509adffb1d2b256a8f8c0523e00761d960166192c6070298f7088a9ae9c9"
RDEPENDS_${PN} += "json-perl"
RECOMMENDS += "test-cpan-meta-perl-native"
RECOMMENDS += "test-pod-coverage-perl-native"
RECOMMENDS += "test-pod-perl-native"

S = "${WORKDIR}/Test-CPAN-Meta-JSON-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
