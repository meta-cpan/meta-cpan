DESCRIPTION = "Class::Data::Inheritable is for creating accessor/mutators to class data. \
That is, if you want to store something about your class as a whole \
(instead of about a single object). This data is then inherited by your \
subclasses and can be overridden."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Data-Inheritable"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RS/RSHERER/Class-Data-Inheritable-0.09.tar.gz"

SRC_URI[md5sum] = "bd25ecd6e5d528fbc3783edf1b8facef"
SRC_URI[sha256sum] = "44088d6e90712e187b8a5b050ca5b1c70efe2baa32ae123e9bd8f59f29f06e4d"

S = "${WORKDIR}/Class-Data-Inheritable-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
