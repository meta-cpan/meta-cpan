DESCRIPTION = "XML::SAX is a SAX parser access API for Perl. It includes classes and APIs \
required for implementing SAX drivers, along with a factory class for \
returning any SAX parser installed on the user's system."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-SAX"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GR/GRANTM/XML-SAX-1.00.tar.gz"

SRC_URI[md5sum] = "861a454f7bf269990ed2c1c125f4db48"
SRC_URI[sha256sum] = "45ea6564ef8692155d57b2de0862b6442d3c7e29f4a9bc9ede5d7ecdc74c2ae3"
RDEPENDS_${PN} += "xml-namespacesupport-perl"
RDEPENDS_${PN} += "xml-sax-base-perl"

S = "${WORKDIR}/XML-SAX-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
