DESCRIPTION = "If you don't know anything about automated testing in Perl then you \
should probably read about Test::Simple and Test::More before preceding. \
Test::Deep uses the Test::Builder framework."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Deep"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Test-Deep-0.117.tar.gz"

SRC_URI[md5sum] = "847601f96bf5438aa708323661e9c2de"
SRC_URI[sha256sum] = "8dabe31cef91456bc2348f85520913bd89f5bc8f694dce4cb1b4e498242813f8"
DEPENDS += "test-nowarnings-perl-native"
DEPENDS += "test-simple-perl-native"

S = "${WORKDIR}/Test-Deep-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
