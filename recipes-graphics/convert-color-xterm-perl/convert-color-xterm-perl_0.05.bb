DESCRIPTION = "This subclass of Convert::Color::RGB8 provides lookup of the colors that \
xterm uses by default. Note that the module is not intelligent enough to \
actually parse the XTerm configuration on a machine, nor to query a running \
terminal for its actual colors. It simply implements the colors that are \
present as defaults in the XTerm source code."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Convert-Color-XTerm"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Convert-Color-XTerm-0.05.tar.gz"

SRC_URI[md5sum] = "7f8cc9bb8807af3481febc897043cadb"
SRC_URI[sha256sum] = "eac0939d9677b8e161fb96d087c04a91d5f9041a542822e69209d3f79c8cedb2"
RDEPENDS_${PN} += "convert-color-perl"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Convert-Color-XTerm-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
