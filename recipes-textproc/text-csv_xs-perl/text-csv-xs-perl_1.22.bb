DESCRIPTION = "Text::CSV_XS provides facilities for the composition and decomposition of \
comma-separated values. An instance of the Text::CSV_XS class will combine \
fields into a "CSV" string and parse a "CSV" string into fields."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Text-CSV_XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HM/HMBRAND/Text-CSV_XS-1.22.tgz"

SRC_URI[md5sum] = "05b8fd5fc9f9bc90f3889a146a1da523"
SRC_URI[sha256sum] = "e253853694e68eeaf08ca413bb05d457327754b9e246fd5242919849ecf007f7"
RRECOMMENDS_${PN} += "encode-perl"

S = "${WORKDIR}/Text-CSV_XS-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
