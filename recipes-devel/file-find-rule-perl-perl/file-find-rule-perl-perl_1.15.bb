DESCRIPTION = "I write a lot of things that muck with Perl files. And it always \
annoyed me that finding \"perl files\" requires a moderately complex \
File::Find::Rule \
pattern."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Find-Rule-Perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/File-Find-Rule-Perl-1.15.tar.gz"

SRC_URI[md5sum] = "d8b458792b7eed83c744ae30b1bc3348"
SRC_URI[sha256sum] = "9a48433f86e08ce18e03526e2982de52162eb909d19735460f07eefcaf463ea6"
RDEPENDS_${PN} += "file-find-rule-perl"
RDEPENDS_${PN} += "params-util-perl"

S = "${WORKDIR}/File-Find-Rule-Perl-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
