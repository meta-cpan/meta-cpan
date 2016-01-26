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

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Test-Deep-1.120.tar.gz"

SRC_URI[md5sum] = "a90859f4f362578d1671e3b9aae0d8c1"
SRC_URI[sha256sum] = "207ef8ea71291e5cf8258d1a4d98d360b9b5870989d187b3e2ff3c0fb201becd"
DEPENDS += "test-simple-perl-native"

S = "${WORKDIR}/Test-Deep-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
