DESCRIPTION = "Testing is usually the ugly part of Perl module authoring. Perl gives you a \
standard way to run tests with Test::Harness, and basic testing primitives \
with Test::More. After that you are pretty much on your own to develop a \
testing framework and philosophy. Test::More encourages you to make your \
own framework by subclassing Test::Builder, but that is not trivial."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Base"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IN/INGY/Test-Base-0.89.tar.gz"

SRC_URI[md5sum] = "682b8d527ccea15d4bfe6214ded8f53c"
SRC_URI[sha256sum] = "2794a1aaaeb1d3a287dd2c7286258663796562f7db9ccc6b424bc4f1de8ad014"
RDEPENDS:${PN} += "spiffy-perl"
RRECOMMENDS:${PN} += "test-deep-perl"
DEPENDS += "algorithm-diff-perl-native"
DEPENDS += "text-diff-perl-native"

S = "${WORKDIR}/Test-Base-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
