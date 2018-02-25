DESCRIPTION = "Perl's global destruction is a little tricky to deal with WRT finalizers \
because it's not ordered and objects can sometimes disappear."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-GlobalDestruction"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Devel-GlobalDestruction-0.14.tar.gz"

SRC_URI[md5sum] = "24221ba322cf2dc46a1fc99b53e2380b"
SRC_URI[sha256sum] = "34b8a5f29991311468fe6913cadaba75fd5d2b0b3ee3bb41fe5b53efab9154ab"
RDEPENDS_${PN} += "sub-exporter-progressive-perl"
RRECOMMENDS_${PN} += "devel-globaldestruction-xs-perl"

S = "${WORKDIR}/Devel-GlobalDestruction-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
