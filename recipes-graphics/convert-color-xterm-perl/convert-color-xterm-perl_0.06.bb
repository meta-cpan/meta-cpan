DESCRIPTION = "This subclass of Convert::Color::RGB8 provides lookup of the colors that \
xterm uses by default. Note that the module is not intelligent enough to \
actually parse the XTerm configuration on a machine, nor to query a running \
terminal for its actual colors. It simply implements the colors that are \
present as defaults in the XTerm source code."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Convert-Color-XTerm"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Convert-Color-XTerm-0.06.tar.gz"

SRC_URI[md5sum] = "840ae61e9c51c2f131b331d331dfaa2b"
SRC_URI[sha256sum] = "ae1b56388594bbccef6cffe708007f8bcccd4569e31a2c33745216a635237916"
RDEPENDS:${PN} += "convert-color-perl"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Convert-Color-XTerm-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
