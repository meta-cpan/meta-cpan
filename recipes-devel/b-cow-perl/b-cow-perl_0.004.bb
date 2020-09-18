DESCRIPTION = "B::COW provides some naive additional B helpers to check the COW status of \
one SvPV."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/B-COW"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/B-COW-0.004.tar.gz"

SRC_URI[md5sum] = "a1ef8623a06ce9f6358674d7e604de1e"
SRC_URI[sha256sum] = "fcafb775ed84a45bc2c06c5ffd71342cb3c06fb0bdcd5c1b51b0c12f8b585f51"

S = "${WORKDIR}/B-COW-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
