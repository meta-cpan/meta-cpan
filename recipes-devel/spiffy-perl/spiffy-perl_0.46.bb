DESCRIPTION = ""Spiffy" is a framework and methodology for doing object oriented (OO) \
programming in Perl. Spiffy combines the best parts of Exporter.pm, \
base.pm, mixin.pm and SUPER.pm into one magic foundation class. It attempts \
to fix all the nits and warts of traditional Perl OO, in a clean, \
straightforward and (perhaps someday) standard way."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Spiffy"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IN/INGY/Spiffy-0.46.tar.gz"

SRC_URI[md5sum] = "2ec7007c111a6bc2775bb7c57673a24b"
SRC_URI[sha256sum] = "8f58620a8420255c49b6c43c5ff5802bd25e4f09240c51e5bf2b022833d41da3"

S = "${WORKDIR}/Spiffy-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
