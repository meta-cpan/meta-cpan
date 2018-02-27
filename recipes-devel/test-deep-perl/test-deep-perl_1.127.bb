DESCRIPTION = "If you don't know anything about automated testing in Perl then you should \
probably read about Test::Simple and Test::More before preceding. \
Test::Deep uses the Test::Builder framework."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Deep"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Test-Deep-1.127.tar.gz"

SRC_URI[md5sum] = "eeafe5795ba20ba051a1423f4fa86dd6"
SRC_URI[sha256sum] = "b78cfc59c41ba91f47281e2c1d2bfc4b3b1b42bfb76b4378bc88cc37b7af7268"

S = "${WORKDIR}/Test-Deep-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
